package platform;

import util.Util;


public class PlatformFromUtilDependency implements Util {
    @Override
    public void utilPlatform() {
        System.out.println("Foo.hello");
    }
}


