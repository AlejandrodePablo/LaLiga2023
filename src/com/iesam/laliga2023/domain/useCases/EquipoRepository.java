package src.com.iesam.laliga2023.domain.useCases;

import src.com.iesam.laliga2023.domain.Equipo;

public interface EquipoRepository {

    public Equipo get(Integer codEquipo);

    public void save(Equipo equipo);
}
