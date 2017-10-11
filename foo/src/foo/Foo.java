package foo;

import bar.Bar;

public class Foo implements Bar {
    @Override
    public void hello() {
        System.out.println("Foo.hello");
    }
}
