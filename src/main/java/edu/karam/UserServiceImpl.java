package edu.karam;

import edu.karam.stubs.user.UserRequest;
import edu.karam.stubs.user.UserResponse;
import edu.karam.stubs.user.UserServiceGrpc;
import io.grpc.stub.StreamObserver;

public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {

    @Override
    public void getUSerDetails(UserRequest request, StreamObserver<UserResponse> responseObserver) {
        // add ur logic
        UserResponse.Builder response = UserResponse.newBuilder()
                .setAge(12)
                .setName("KARAM");

        UserResponse userResponse = response.build();
        responseObserver.onNext(userResponse);
        responseObserver.onCompleted(); // you have to call it
    }
}
