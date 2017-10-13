package pluginA;


import platform.Platform;

public class PluginA implements Platform {
    @Override
    public void bar() {
        System.out.println("Foo.hello");
    }
}

