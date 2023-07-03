// Подумать над структурой класса Ноутбук(или Единорогов) для магазина техники - выделить поля и методы. Реализовать в java.
// Переопределить toString, equals и hashCode(как на семинаре).

package NotebooksLibrary;

import java.util.Objects;

public class Notebook {
    
    public long id;
    public String model;
    public String diagonal;
    public String processor;
    public byte RAMnotebook;
    
    public Notebook(long id, String model, String diagonal, String processor, byte RAMnotebook) {
        this.id = id;
        this.model=model;
        this.diagonal = diagonal;
        this.processor = processor;
        this.RAMnotebook = RAMnotebook;
    }

    public boolean availabilityStorehouse()
    {
        return true;
    }

    @Override
    public String toString() {
        return "ID: "+id+" Модель: "+model+" Диагональ: "+ diagonal+" Процессор: "+processor+ " Оперативная память: "+RAMnotebook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return diagonal==notebook.diagonal && processor==notebook.processor && RAMnotebook==notebook.RAMnotebook;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, diagonal, processor, RAMnotebook);
    }


}
