package Singleton.a2;

/**
 * 最多只能生成3个实例
 *
 * @author ningxy
 * @date 2019/10/21
 */
public class Triple {
    private int id;
    private static Triple[] triples = new Triple[]{
            new Triple(990),
            new Triple(991),
            new Triple(992)
    };

    private Triple(int id) {
        this.id = id;
        System.out.println("The instance " + id + " is created.");
    }

    public static Triple getInstance(int id) {
        return triples[id];
    }

    @Override
    public String toString() {
        return "Triple{id=" + id + '}';
    }
}
