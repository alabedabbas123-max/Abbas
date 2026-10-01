package org.spongycastle.jcajce.provider.asymmetric;

public class DH$Mappings extends abcd.AbstractkP {
    public DH$Mappings() {
    }

    @Override
    public void configure(abcd.InterfacegP r4) {
        r4.j6("KeyPairGenerator.DH", "org.spongycastle.jcajce.provider.asymmetric.dh.KeyPairGeneratorSpi");
        r4.j6("Alg.Alias.KeyPairGenerator.DIFFIEHELLMAN", "DH");
        r4.j6("KeyAgreement.DH", "org.spongycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi");
        r4.j6("Alg.Alias.KeyAgreement.DIFFIEHELLMAN", "DH");
        r4.j6("KeyFactory.DH", "org.spongycastle.jcajce.provider.asymmetric.dh.KeyFactorySpi");
        r4.j6("Alg.Alias.KeyFactory.DIFFIEHELLMAN", "DH");
        r4.j6("AlgorithmParameters.DH", "org.spongycastle.jcajce.provider.asymmetric.dh.AlgorithmParametersSpi");
        r4.j6("Alg.Alias.AlgorithmParameters.DIFFIEHELLMAN", "DH");
        r4.j6("Alg.Alias.AlgorithmParameterGenerator.DIFFIEHELLMAN", "DH");
        r4.j6("AlgorithmParameterGenerator.DH", "org.spongycastle.jcajce.provider.asymmetric.dh.AlgorithmParameterGeneratorSpi");
    }
}
