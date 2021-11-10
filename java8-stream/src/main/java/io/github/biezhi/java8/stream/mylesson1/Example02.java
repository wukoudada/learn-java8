package io.github.biezhi.java8.stream.mylesson1;

import com.alibaba.fastjson.JSONObject;
import io.github.biezhi.java8.stream.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Example02 {

    public static void main (String[] args) {

        Node root = Node.builder ().id ( 0 ).parentId ( 0 ).description ( "根节点" ).childs ( new ArrayList<> ()) .build ();

        String jsonRes =JSONObject.toJSONString ( getChildernList (root, Node.bulidData ()  ) );
        System.out.println (jsonRes);

    }

    static List<Node> getChildernList(Node parent, List<Node> all){

        return all.stream ()
                .filter ( e -> Objects.equals ( parent.getId (), e.getParentId () ) )
                .peek ( e -> {
                    parent.getChilds ().add ( e );
                    getChildernList(e, all);
                })
                .collect ( Collectors.toList () );


    }

}
