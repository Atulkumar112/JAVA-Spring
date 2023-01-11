//--------------------------------------------------------------------------------Tight Coupling--------------------------------------
//Tight Coupling:- tightly coupling is not good to use in project and other things always use loosly coupled
//ex:-
public class ComplexBusinessService{
    SortAlgorithm sortAlgorithm = new SortAlgorithm();  // this is called the tightly coupling
}
pulbic class BubbleSortAlgorithm implements SortAlgorithm{
}

//-------------------------------------------------------------------Loosly Coupling------------------------------------------------------------

public class ComplexBusinessService{
    SortAlgorithm sortAlgorithm;      //= new SortAlgorithm();  //if i comment this initializing and then use the constructor then it is called the loosly coupled
    public ComplexBusinessService(SortAlgorithm sortAlgorithm){  // constructor
        this.sortAlgorithm = sortAlgorithm;
    }
}
pulbic class BubbleSortAlgorithm implements SortAlgorithm{
}
