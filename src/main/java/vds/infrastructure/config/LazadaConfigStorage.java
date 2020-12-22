package vds.infrastructure.config;

public class LazadaConfigStorage implements ConfigStorage {
    @Override
    public void getConfig() {
        System.out.println("Lazada getConfig");
    }
}
