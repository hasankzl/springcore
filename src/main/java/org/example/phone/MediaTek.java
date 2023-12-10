package org.example.phone;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary if there is duplicate beans, use this bean as primary
public class MediaTek  implements MobileProcessor{
    @Override
    public void process() {
        System.out.println("MediaTek processor");
    }
}
