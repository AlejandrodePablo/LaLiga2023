package src.com.iesam.laliga2023.domain.useCases;

import src.com.iesam.laliga2023.domain.Equipo;

public class CreateEquipoUseCase {

    private EquipoRepository equipoRepository;

    public CreateEquipoUseCase( EquipoRepository equipoRepository){
        this.equipoRepository = equipoRepository;
    }

    public void execute(Equipo equipo){
        equipoRepository.save(equipo);
    }
}