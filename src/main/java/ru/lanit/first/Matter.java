package ru.lanit.first;


public class Matter {
    protected String science;
    protected boolean mathDescription;

    public void printClass() {
        System.out.println("Matter");
    }
    public void printAncestor() {
        System.out.println("Object");
    }
    public void printDescendants() {
        System.out.println(Descendants.values());
    }
    enum Descendants{
        Substance,
        Field,
        QuantumFields,
        ObscurePhysicalNature
    }
}

enum Description{
    Science {
        public String descript(String s) {
            return "The " + s + " is studying this area.";
        }
        },

    MathDescription {
        public String descript(boolean b) {
            if (b == true) {
                return "This subject has math description.";
            }
            return "This subject has no math description.";
        }
    },

    Mass {
        public String descript(int i) {
            return "The mass of the substance equals " + i + ".";
        }
    },

    State {
        public String descript(String s) {
            return "The substance is in a state " + s + ".";
        }
    },

}
