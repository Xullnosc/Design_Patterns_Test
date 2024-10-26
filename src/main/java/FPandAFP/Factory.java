package FPandAFP;
// Helps with decoupling
// Follows OCP(Open-Closed principle)

public abstract class Factory {
    public abstract Gpu createGpu();
    public Gpu assembleGpu() {
        Gpu gpu = createGpu();
        gpu.assemble();
        return gpu;
    }
}

interface Gpu {
    void assemble();
}

class MSIManufacturer extends Factory{
    @Override
    public Gpu createGpu(){
        return new MSIgpu();
    }
}

class ASUSManufacturer extends Factory{
    @Override
    public Gpu createGpu(){
        return new ASUSgpu();
    }
}

class MSIgpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("MSIgpu assembled");
    }

}

class ASUSgpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("ASUSgpu assembled");
    }
}









