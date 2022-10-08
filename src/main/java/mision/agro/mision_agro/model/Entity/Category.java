package mision.agro.mision_agro.model.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Categoria")
public class Category {

    @Id
    @Getter @Setter @Column(name = "categoriaId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter @Setter @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @OneToMany(mappedBy = "category")
    private List<Product> Producto;
    
}

