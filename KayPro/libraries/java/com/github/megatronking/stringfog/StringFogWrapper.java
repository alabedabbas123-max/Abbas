package com.github.megatronking.stringfog;

public final class StringFogWrapper implements IStringFog {
    private IStringFog mStringFogImpl;

    public StringFogWrapper(String str) {
        try {
            this.mStringFogImpl = (IStringFog) Class.forName(str).newInstance();
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException(new StringBuffer().append("Stringfog implementation class not found: ").append(str).toString());
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException(new StringBuffer().append("Stringfog implementation class access failed: ").append(e2.getMessage()).toString());
        } catch (InstantiationException e3) {
            throw new IllegalArgumentException(new StringBuffer().append("Stringfog implementation class new instance failed: ").append(e3.getMessage()).toString());
        }
    }

    @Override
    public String decrypt(String str, String str2) {
        return this.mStringFogImpl == null ? str : this.mStringFogImpl.decrypt(str, str2);
    }

    @Override
    public String encrypt(String str, String str2) {
        return this.mStringFogImpl == null ? str : this.mStringFogImpl.encrypt(str, str2);
    }

    @Override
    public boolean overflow(String str, String str2) {
        return this.mStringFogImpl != null && this.mStringFogImpl.overflow(str, str2);
    }
}
