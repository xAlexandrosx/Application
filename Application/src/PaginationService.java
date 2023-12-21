public class PaginationService {
    private String[] data;
    private int elementsPerPage;

    public PaginationService(String[] data, int elementsPerPage) {
        this.data = data;
        this.elementsPerPage = elementsPerPage;
    }

    public int getElementsCount(){
        return data.length*elementsPerPage;
    }

    public int getPageNumberByElementIndex(int index){
        if(index<0 || index>1){
            return -1;
        }



        return 0;
    }
}

/*
// dla tablicy `data` zawierającej 10 elementów, na jedną stronę przypadają dwa elementy
// (zmienna `elementsPerPage` ma wartość 2)

getElementsCount(); // 10

getPageNumberByElementIndex(0); // 0
// pierwszy element mieści się na pierwszej stronie

getPageNumberByElementIndex(1); // 0
// drugi element także znajduje się na pierwszej stronie, ponieważ `elementsPerPage == 2`

getPageNumberByElementIndex(2); // 1
// trzeci element (o indeksie 2) mieści się na następnej stronie

getPageNumberByElementIndex(8); // 4

getPageNumberByElementIndex(100); // -1
// indeks `100` jest nieprawidłowy, bo największy indeks to `9`

getPageNumberByElementIndex(-5); // -1
// ujemny indeks jest nieprawidłowy

*/