package facade;

public class Client {
    public static void main(String[] args) {
        UploadFacade ytUploadFacade = new YTUploadFacade();
        String readPath = "";
        String uploadPath = "";
        ytUploadFacade.startUpload(readPath, uploadPath, Format.MP4);

    }
}
