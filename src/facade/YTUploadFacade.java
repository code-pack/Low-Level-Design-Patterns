package facade;

public class YTUploadFacade implements UploadFacade {
    private VideoReader videoReader;
    private VideoCompressor videoCompressor;
    private VideoEncoder videoEncoder;
    private VideoPostProcessor videoPostProcessor;
    private VideoUploader videoUploader;

   public YTUploadFacade() {
       // initialize all these dependencies;
   }

    @Override
    public boolean startUpload(String readPath, String uploadPath, Format uploadFormat) {
        Video video = videoReader.read(readPath);
        video = videoCompressor.compress(video);
        video = videoEncoder.encode(video, uploadFormat);
        video = videoPostProcessor.process(video);
        return videoUploader.upload(video, uploadPath);
    }
}
