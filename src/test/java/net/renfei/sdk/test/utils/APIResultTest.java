package net.renfei.sdk.test.utils;

import lombok.SneakyThrows;
import net.renfei.sdk.comm.StateCode;
import net.renfei.sdk.entity.APIResult;
import net.renfei.sdk.test.Tests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author RenFei
 */
public class APIResultTest extends Tests {
    @Test
    public void testAPIResult() throws InterruptedException {
        Runnable taskTemp = new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                System.out.println("==== " + this.getClass().getName() + " ====");
                Assertions.assertNotNull(APIResult.success());
                APIResult apiResult = APIResult.builder()
                        .code(StateCode.OK)
                        .message("test")
                        .data("test")
                        .build();
                Assertions.assertNotNull(apiResult);
                System.out.println(apiResult);
            }
        };
        startTaskAllInOnce(100, taskTemp);
    }
}
