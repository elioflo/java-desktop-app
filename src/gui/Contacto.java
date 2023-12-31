package gui;

public class Contacto implements Comparable<Contacto> {

  private int id;
  private String nombre;
  private String telefono;
  private String email;

  public Contacto() {
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public int compareTo(Contacto t) {
    return id - t.id;
  }
}
