package vds.infrastructure.config;

public class TikiConfigStorage implements ConfigStorage {
    @Override
    public void getConfig() {
        System.out.println("Tiki getConfig");
    }
}
