package pluginC;

import platform.Platform;

public class PluginC {
    public class PluginA implements Platform {
        @Override
        public void bar() {
            System.out.println("Foo.hello");
        }
    }
}



