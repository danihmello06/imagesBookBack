package dhm.imageBookBack.service

import dhm.imageBookBack.model.User
import dhm.imageBookBack.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class UserService(
    @Autowired
    private val userRepository: UserRepository
){
    
    fun list(): List<User> = userRepository.findAll()
    
    fun publish(user: User) {
        userRepository.save(user)
    }
    
    fun findById(id: UUID): User? = userRepository.findFirstById(id)
    
    fun delete(user: User) = userRepository.delete(user)
    
}