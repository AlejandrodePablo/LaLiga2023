package src.com.iesam.laliga2023.data;

import src.com.iesam.laliga2023.domain.Equipo;

public class EquipoDataRepository implements src.com.iesam.laliga2023.domain.useCases.EquipoRepository {

    private EquipoLocalDataSource localDataSource;


    @Override
    public Equipo get(Integer codEquipo) {
        return (Equipo) localDataSource.findById(codEquipo);
    }

    @Override
    public void save(Equipo equipo) {
        localDataSource.save(equipo);
    }
}

