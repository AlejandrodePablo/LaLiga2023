package src.com.iesam.laliga2023.domain.useCases;

import src.com.iesam.laliga2023.domain.Equipo;

public class BuscarEquipoUseCase {

    private EquipoRepository equipoRepository;

    public BuscarEquipoUseCase( EquipoRepository equipoRepository){
        this.equipoRepository = equipoRepository;
    }

    public void save(Equipo equipo){
        equipoRepository.save(equipo);
    }
}