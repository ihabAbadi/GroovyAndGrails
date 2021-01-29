package demoecommerce

import grails.transaction.NotTransactional
import grails.transaction.Transactional


class UploadService {
    def servletContext
    @NotTransactional
    def upload(def file) {
        //A refaire avec random name
        def urlFile = 'images/images1.png'
        file.transferTo(new File(servletContext.getRealPath('/')+urlFile))
        Image image = new Image(url: urlFile)
        return image
    }
}
