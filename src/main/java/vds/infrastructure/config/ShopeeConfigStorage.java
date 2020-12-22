package vds.infrastructure.config;

public class ShopeeConfigStorage implements ConfigStorage {
    @Override
    public void getConfig() {
        System.out.println("Shopee getConfig");
    }
}
