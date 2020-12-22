package vds.infrastructure.adapter;

import vds.infrastructure.config.ConfigStorage;
import vds.infrastructure.model.Partner.PartnerKey;

public interface PartnerConfigFactory {
    ConfigStorage getPartnerConfig(PartnerKey key);
}
