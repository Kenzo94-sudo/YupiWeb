package model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario")
    private Integer id_usuario;

    @ManyToOne
    @JoinColumn(name = "id_rol",
            referencedColumnName = "id_rol",
    nullable = false)
    private Rol rol;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;


    public Usuario(Integer id_usuario, Rol rol, String username, String password) {
        this.id_usuario = id_usuario;
        this.rol = rol;
        this.username = username;
        this.password = password;
    }

    public Usuario() {
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
