package no.kantega.pdf.conversion;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ViableConversion {

    String[] from();

    String[] to();
}
