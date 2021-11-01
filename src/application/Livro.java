package application;

import java.util.Objects;

public class Livro {

    private String name;
    private Integer pagina;

    public Livro(){
    }

    public Livro(String name, Integer pagina) {
        this.name = name;
        this.pagina = pagina;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPagina() {
        return pagina;
    }

    public void setPagina(Integer pagina) {
        this.pagina = pagina;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", pagina=" + pagina +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro)) return false;
        Livro livro = (Livro) o;
        return getName().equals(livro.getName()) && getPagina().equals(livro.getPagina());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPagina());
    }
}
