//Creator : 21102061_I Made Mei Sastra Jayadi

public class Laptop {
    private String Merk;
    private int CPUCore;
    private float Weight;
    private String Color;
    private int Release;
    private boolean UseNvidia;

    public void setMerk(String merk) {
        this.Merk = merk;
    }

    public void setWeight(float weight) {
        this.Weight = weight;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public void setRelease(int release) {
        this.Release = release;
    }

    public void setCPUCore(int core) {
        this.CPUCore = core;
    }

    public void setUseNvidia(boolean nv) {
        this.UseNvidia = nv;
    }

    public String getMerk() {
        return this.Merk;
    }

    public float getWeight() {
        return this.Weight;
    }

    public String getColor() {
        return this.Color;
    }

    public int getCPUCore() {
        return this.CPUCore;
    }

    public int getRelease() {
        return this.Release;
    }

    public boolean getUseNvidia() {
        return this.UseNvidia;
    }

}
