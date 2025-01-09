// Interface I----------------------------------------------------------
interface Sporty {
    String sports();

    default String playSport(){
        return "Plays " + sports();
    }
}

// Interface II---------------------------------------------------------
interface Art {
    String art();

    default String doesArt(){
        return "Loves art & does " + art();
    }
}




// Base Class -----------------------------------------------------------
class Grandparent {
    String familyName;

    public Grandparent(String familyName) {
        this.familyName = familyName;
    }

    @Override
    public String toString() {
        return "Family Name: " + this.familyName;
    }
}


// Single-Level Inheritance ---------------------------------------------
class Parent extends Grandparent {
    String parentName;

    public Parent(String familyName, String parentName) {
        super(familyName);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return super.toString() + " | Parent Name: " + this.parentName;
    }
}


// Multi-Level Inheritance ----------------------------------------------
class Child extends Parent {
    String childName;

    public Child(String familyName, String parentName, String childName) {
        super(familyName, parentName);
        this.childName = childName;
    }

    @Override
    public String toString() {
        return super.toString() + " | Child Name: " + this.childName;
    }
}



// Hierarchical Inheritance ---------------------------------------------
class Uncle extends Grandparent {
    String uncleName;

    public Uncle(String familyName, String uncleName) {
        super(familyName);
        this.uncleName = uncleName;
    }

    @Override
    public String toString() {
        return super.toString() + " | Uncle Name: " + this.uncleName;
    }
}



// Hybrid Inheritence------------------------------------------------------
class Cousin extends Uncle implements Sporty, Art{
    String favSport;
    String favArt;

    String cousinName;

    public Cousin(String familyName, String uncleName, String cousinName, String favSport, String favArt) {
        super(familyName, uncleName);
        this.cousinName = cousinName;
        this.favSport = favSport;
        this.favArt = favArt;
    }


    @Override
    public String sports(){
        return favSport;
    }

    @Override
    public String art(){
        return favArt;
    }

    @Override
    public String toString() {
        return super.toString() + " | Cousin Name: " + this.cousinName + "| Favourite Sports: " + sports() + "| Favourite Art: " + art();
    }
}




// Main Class -----------------------------------------------------------
public class inheritenceEx {
    public static void main(String[] args) {
        // Grandparent
        Grandparent grandparent = new Grandparent("Smith");
        System.out.println(grandparent);

        // Single-Level Inheritance
        Parent parent = new Parent("Smith", "John");
        System.out.println(parent);

        // Multi-Level Inheritance
        Child child = new Child("Smith", "John", "Emma");
        System.out.println(child);

        // Hierarchical Inheritance
        Uncle uncle = new Uncle("Smith", "Robert");
        System.out.println(uncle);

        // Simulated Hybrid (Combination of Hierarchical + Multi-Level)
        Cousin cousin = new Cousin("Smith", "Robert", "Jake", "football", "sketching");
        System.out.println(cousin);
        System.out.println(cousin.playSport());
        System.out.println(cousin.doesArt());
    }
}










// Hybrid Inheritance Structure for the Code:

//                       +------------------+
//                       |  Grandparent     |
//                       |------------------|
//                       |  familyName      |
//                       +------------------+
//                               |
//     +-------------------------+-------------------------+
//     |                                                   |
// +------------------+                              +------------------+
// |     Parent       |                              |      Uncle       |
// |------------------|                              |------------------|
// |  parentName      |                              |  uncleName       |
// +------------------+                              +------------------+
//            |                                           |
//            |                                           |
//     +------------------+                       +------------------+
//     |      Child       |                       |     Cousin       |
//     |------------------|                       |------------------|
//     |   childName      |                       |  cousinName      |
//     +------------------+                       |                  |
//                                                |  Implements:     |
//                                                |       Sporty, Art|
//                                                +------------------+

// Explanation:

// 1. **Grandparent**:
//    - Base class from which all other classes inherit directly or indirectly.

// 2. **Parent**:
//    - Inherits directly from Grandparent (Single-Level Inheritance).

// 3. **Child**:
//    - Inherits from Parent (Multi-Level Inheritance).

// 4. **Uncle**:
//    - Inherits directly from Grandparent (Hierarchical Inheritance).

// 5. **Cousin**:
//    - Inherits from Uncle (Simulated Hybrid Structure by combining Hierarchical and Multi-Level Inheritance and Multiple Inheritence [interfaces]).