package suosong;

/**
 * created by suosong on 2020/2/25 6:17 下午
 */
public class Cat {
    private String name;


    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
