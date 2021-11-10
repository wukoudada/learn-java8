package io.github.biezhi.java8.stream;

import com.google.common.collect.Lists;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 树形节点
 */
@Data
@Builder
public class Node {

    private int id;
    private int parentId;
    private String description;
    private List<Node> childs;

    public static List<Node> bulidData(){
        List<Node> list = new ArrayList<> ();
        list.add ( Node.builder().id(1).parentId(0).description("节点1").childs( Lists.newArrayList ()).build());
        list.add ( Node.builder().id(2).parentId(1).description("节点1.1").childs( Lists.newArrayList ()).build());
        list.add ( Node.builder().id(3).parentId(1).description("节点1.2").childs( Lists.newArrayList ()).build());
        list.add ( Node.builder().id(4).parentId(0).description("节点2").childs( Lists.newArrayList ()).build());
        list.add ( Node.builder().id(5).parentId(4).description("节点2.1").childs( Lists.newArrayList ()).build());
        list.add ( Node.builder().id(6).parentId(4).description("节点2.2").childs( Lists.newArrayList ()).build());
        list.add ( Node.builder().id(7).parentId(5).description("节点2.1.1").childs( Lists.newArrayList ()).build());
        list.add ( Node.builder().id(8).parentId(6).description("节点2.2.1").childs( Lists.newArrayList ()).build());
        list.add ( Node.builder().id(9).parentId(0).description("节点1.3").childs( Lists.newArrayList ()).build());
        list.add ( Node.builder().id(10).parentId(3).description("节点1.2.1").childs( Lists.newArrayList ()).build());
        return list;
    }

}
