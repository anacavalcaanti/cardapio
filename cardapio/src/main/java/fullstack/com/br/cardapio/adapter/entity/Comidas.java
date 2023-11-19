package fullstack.com.br.cardapio.adapter.entity;


import jakarta.persistence.*;

@Table(name = "comidas")
@Entity(name = "comidas")
public class Comidas {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Integer preco;
    private String imagem;


}
