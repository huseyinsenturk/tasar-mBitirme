package com.springjpa.label;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.nio.charset.Charset;

@RestController
public  class GelenIstek implements ApplicationContextAware {


    @Autowired
    private CevapUretimi cevapUretimi;



    @PostMapping(value = "/api/upload/extended/",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)

    @LogRequest
    public IstekCevabi generateAllLabelsWithExtendedResponse(HttpServletRequest request,
                                                          @RequestBody MultipartFile labelInput) {

        IstekCevabi istekCevabi ;
        String carrier = "";
        String userName = "";
        System.out.println(GelenIstek.class.getName().toString());
        try {

            String inputString = new String(labelInput.getBytes(), Charset.forName("ISO-8859-1"));

            istekCevabi = cevapUretimi.generateLabel(labelInput, carrier, userName);// kontro edelim
            Long endTime = getSistemZamani();

            System.out.println("Universal extended upload: ExtendedLabelResponse prepared with status 'OK' (1). The calculations took: " + " ms ------------");
        } catch (Exception e) {

        Cevaplar cevaplar1 = new Cevaplar();
            System.out.println("Caught exception while generateAllLabelsWithExtendedResponse. Please investigate: ");
            System.out.println("Universal extended upload: ExtendedLabelResponse finished with status 'ERROR' (0) and exception: \n");
            System.out.println("Universal extended upload: Sending email to admins...");
            istekCevabi =null;
        }
            /*

            ErrorMessage error = ErrorMessage.builder()
                    .carrier(carrier)
                    .filename(labelInput.getOriginalFilename() )
                    .message(errorMessage)
                    .createdAt(LocalDateTime.now())
                    .type(ErrorType.LABEL_UPLOAD)
                    .username(userName)
                    .build();
            errorService.saveErrorMessage( error );
            // send notification to admins
            Gson gson = new Gson();
            String[] emails = gson.fromJson(propertyService.getPropertyValue(PropertyKeys.email_admins.name()), String[].class);

            EmailSender emailSender = emailFactory.getSender();
*/

         //   final String finalCarrier = carrier;

          /*
            Stream.of(emails).forEach(email -> emailSender.send(EmailSubjects.EXTENDED_RESPONSE_ERROR.getValue(),
                    "<b>" + finalCarrier + "</b>:" +
                            "</br>Label generation for input file: <b>" + labelInput.getOriginalFilename() + "</b>" +
                            "</br>was finished with exception: <b>" + errorMessage +
                            "</b>", email));
            */


        return istekCevabi;
    }


    private long getSistemZamani() {
        return System.currentTimeMillis();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        System.out.println("geldi");

    }
}
