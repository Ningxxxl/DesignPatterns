package Builder.a1;

import lombok.AllArgsConstructor;

/**
 * @author ningxy
 * @date 2019/10/22
 */
@AllArgsConstructor
public class Director {
    private Builder builder;

    /**
     * 编写文档
     */
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString(" 从早上到下午 ");
        builder.makeItems(new String[]{
                "早上好！",
                "中午好！",
                "下午好！"
        });
        builder.makeString(" 晚上 ");
        builder.makeItems(new String[]{
                "晚上好！",
                "晚安。",
                "再见。"
        });
        builder.close();
    }
}
