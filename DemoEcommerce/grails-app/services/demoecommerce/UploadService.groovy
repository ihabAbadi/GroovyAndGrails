package demoecommerce

import grails.transaction.NotTransactional
import grails.transaction.Transactional


class UploadService {
    def servletContext

    def upload(def file) {
        //A refaire avec random name
        def urlFile = "images/${nameGenerator(('A'..'Z').join(), 7)}.png"
        file.transferTo(new File(servletContext.getRealPath('/')+urlFile))
        Image image = new Image(url: urlFile)
        image.save()
        return image
    }

    private String nameGenerator(String range,int n) {
        new Random().with {(1..n).collect{range[nextInt(range.length())]}.join()}
    }
}
