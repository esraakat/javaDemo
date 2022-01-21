public class Eukaryote {

    private double nucleusRadius;
    private double mitochondrialVolume;
    private String cellWallStructure = absent, present;
    private String trophy = heterotrophy, autotrophy;
    private String cellularStructure = unicellular, multicellular;

    public Eukaryote(){

    }
    public Eukaryote(){
        nucleusRadius=1.0;
        mitochondriaVolume = 1.0;
        cellWallStructure="absent";
        trophy ="heterotrophic";
        cellularStructure="multicellular";
    }

    public double getNucleusRadius() {
        return nucleusRadius;
    }

    public void setNucleusRadius(double nucleusRadius) {
        this.nucleusRadius = nucleusRadius;
    }

    public double getMitochondrialVolume() {
        return mitochondrialVolume;
    }

    public void setMitochondrialVolume(double mitochondrialVolume) {
        this.mitochondrialVolume = mitochondrialVolume;
    }

    public String getCellWallStructure() {
        return cellWallStructure;
    }

    public void setCellWallStructure(String cellWallStructure) {
        this.cellWallStructure = cellWallStructure;
    }

    public String getTrophy() {
        return trophy;
    }

    public void setTrophy(String trophy) {
        this.trophy = trophy;
    }

    public String getCellularStructure() {
        return cellularStructure;
    }

    public void setCellularStructure(String cellularStructure) {
        this.cellularStructure = cellularStructure;
    }
}
