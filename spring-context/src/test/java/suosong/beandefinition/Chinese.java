package suosong.beandefinition;

/**
 * 一个主要的bean对象
 * created by suosong on 2020/2/26 2:10 下午
 */
public class Chinese {
    private String name;

    public Chinese(String name) {
        this.name = name;
    }

    public Chinese() {
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                '}';
    }
}
