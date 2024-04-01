package com.ghazivet.ghazivet.logica;

import com.ghazivet.ghazivet.logica.Duenios;
import com.ghazivet.ghazivet.logica.Especies;
import com.ghazivet.ghazivet.logica.Generos;
import java.sql.Timestamp;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-01T13:20:47", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Mascotas.class)
public class Mascotas_ { 

    public static volatile SingularAttribute<Mascotas, Especies> especie;
    public static volatile SingularAttribute<Mascotas, String> raza;
    public static volatile SingularAttribute<Mascotas, String> color;
    public static volatile SingularAttribute<Mascotas, Duenios> duenio;
    public static volatile SingularAttribute<Mascotas, Generos> genero;
    public static volatile SingularAttribute<Mascotas, Timestamp> fecha_actualizacion;
    public static volatile SingularAttribute<Mascotas, Timestamp> fecha_creacion;
    public static volatile SingularAttribute<Mascotas, String> nombre;
    public static volatile SingularAttribute<Mascotas, Date> edad;
    public static volatile SingularAttribute<Mascotas, Integer> id_mascota;

}