package FPandAFP;
// Helps with decoupling
// Follows OCP(Open-Closed principle)
// Adapt to updates and changes
// A step up from Good 'ol Factory Design Pattern

public abstract class AbstractFactory {
    public abstract Paper createPaper();

    public abstract Pen createPen();

    public Paper assemblePaper() {
        Paper paper = createPaper();
        paper.assemble();
        return paper;
    }

    public Pen assemblePen() {
        Pen pen = createPen();
        pen.assemble();
        return pen;
    }
}

interface Paper {
    void assemble();
}

interface Pen {
    void assemble();
}

class PaperAManu extends AbstractFactory {
    @Override
    public Paper createPaper() {
        return new PaperB();
    }

    @Override
    public Pen createPen() {
        return new PenA();
    }
}

class PaperBManu extends AbstractFactory {
    @Override
    public Paper createPaper() {
        return new PaperB();
    }

    @Override
    public Pen createPen() {
        return new PenB();
    }
}

class PaperA implements Paper {
    @Override
    public void assemble() {
        System.out.println("PaperA assembled");
    }

}

class PenA implements Pen {
    @Override
    public void assemble() {
        System.out.println("PenA assembled");
    }
}

class PenB implements Pen {
    @Override
    public void assemble() {
        System.out.println("PenB assembled");
    }
}

class PaperB implements Paper {
    @Override
    public void assemble() {
        System.out.println("PaperB assembled");
    }
}
