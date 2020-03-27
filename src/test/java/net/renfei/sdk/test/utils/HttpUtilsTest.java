package net.renfei.sdk.test.utils;

import net.renfei.sdk.entity.MyIP;
import net.renfei.sdk.http.HttpRequest;
import net.renfei.sdk.http.HttpResult;
import net.renfei.sdk.test.TestApplication;
import net.renfei.sdk.utils.HttpUtils;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class HttpUtilsTest extends TestApplication {
    private static final Logger log = LoggerFactory.getLogger(HttpUtilsTest.class);

    @Test
    public void testHttpGet() throws IOException {
        System.out.println("==== " + this.getClass().getName() + " ====");
        HttpRequest request = HttpRequest.create().url("http://ip.renfei.net");
        HttpResult result = HttpUtils.get(request);
        log.info(result.getResponseText());
        MyIP myIP = result.parseObject(MyIP.class);
        log.info(myIP.getClientIP());
    }
}
