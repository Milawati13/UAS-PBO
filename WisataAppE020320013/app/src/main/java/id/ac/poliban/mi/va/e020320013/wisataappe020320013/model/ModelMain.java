package id.ac.poliban.mi.va.e020320013.wisataappe020320013.model;


public class ModelMain {

    private String txtName;
    private int imgSrc;

    public ModelMain(String txtName, int imgSrc) {
        this.txtName = txtName;
        this.imgSrc = imgSrc;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public int getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(int imgSrc) {
        this.imgSrc = imgSrc;
    }

}
