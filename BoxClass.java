package Tirgul7;

import lombok.ToString;

@ToString
public class Box {
    protected String content;
    protected String owner;

    public Box(String content, String owner) {
        this.content = content;
        this.owner = owner;
    }
}
