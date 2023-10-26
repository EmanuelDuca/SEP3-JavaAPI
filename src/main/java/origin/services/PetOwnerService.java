package origin.services;

import io.grpc.stub.StreamObserver;
import origin.DAOInterfaces.PetOwnerDAOInterface;
import origin.mappers.PetOwnerMapper;
import origin.protobufClasses.*;
import origin.shared.PetOwnerEntity;
import origin.protobufClasses.Void;



public class PetOwnerService extends PetOwnerServiceGrpc.PetOwnerServiceImplBase {

    private PetOwnerDAOInterface petOwnerDAO;// maybe dao impl
    public PetOwnerService()     {    }

    @Override
    public void loginPetOwner(LoginUser request, StreamObserver<PetOwner> responseObserver)
    {
        PetOwnerEntity petOwner = new PetOwnerEntity(request.getUsername(), request.getPassword());
        PetOwnerEntity loginUser = petOwnerDAO.loginPetOwner(petOwner);
        responseObserver.onNext(PetOwnerMapper.mapProto(loginUser));
        responseObserver.onCompleted();
    }

    @Override
    public void createPetOwner(RegisterPetOwner request, StreamObserver<PetOwner> responseObserver)
    {
        PetOwnerEntity petOwner = new PetOwnerEntity(
                request.getUsername(),
                request.getPassword(),
                request.getFName(),
                request.getLName());
        PetOwnerEntity registerPetOwner = petOwnerDAO.registerUser(petOwner);
        responseObserver.onNext(PetOwnerMapper.mapProto(registerPetOwner));
        responseObserver.onCompleted();

    }

    @Override
    public void findPetOwner(SearchField request, StreamObserver<PetOwner> responseObserver)
    {
        PetOwnerEntity petOwner = petOwnerDAO.findPetOwner(request.getSearch());
        if (petOwner != null)
        {
            responseObserver.onNext(PetOwnerMapper.mapProto(petOwner));
            responseObserver.onCompleted();
        }
        else
        {
            responseObserver.onError(new Exception("Error: There is no Pet Owner with such a username"));
        }
    }

    @Override
    public void updatePetOwnerInformation(PetOwnerInfo request,
                                          StreamObserver<origin.protobufClasses.Void> responseObserver)
    {
        PetOwnerEntity petOwner = new PetOwnerEntity();
        petOwner.setUsername(request.getUsername());
        petOwner.setF_name(request.getFName());
        petOwner.setL_name(request.getLName());
        petOwner.setPhone(request.getPhone());
        petOwner.setEmail(request.getEmail());
        petOwnerDAO.updatePetOwnerInformation(petOwner);
        responseObserver.onNext(Void.newBuilder().build());
        responseObserver.onCompleted();
    }

}
