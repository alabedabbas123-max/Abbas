package org.xutils.http.request;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import org.xutils.http.RequestParams;

public class AssetsRequest extends ResRequest {
    public AssetsRequest(RequestParams requestParams, Type type) throws Throwable {
        super(requestParams, type);
    }

    @Override
    public InputStream getInputStream() throws IOException {
        if (this.inputStream == null) {
            this.inputStream = this.params.getContext().getResources().getAssets().open(this.queryUrl.replace("assets://", ""));
            this.contentLength = this.inputStream.available();
        }
        return this.inputStream;
    }
}
