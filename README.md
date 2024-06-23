Internal working of Spring security

Flow->

- Filter - BasicAuthenticationFilter

    - This extends OncePerRequestFilter
    - calls method doFilterInternal
    - which converts the request into Authentication Object
    - Then it checks if the created Authentication object is null
    - If not then it calls authenticate method using Authentication manager
    - Authentication authResult = this.authenticationManager.authenticate(authRequest);
    - Now AuthenticationManager is an interface which does not have implementation for authenticate
    - Open the interface and search for implementations for AuthenticationManager
    - Ctrl+Alt+B
    - Then it goes to Provider manager
    - ProviderManager calls authenticate
    - Which then checks what is the type of authentication present
    - then calls the userDetails
    - Finally then it sets the Security context authenticated

-Whatever we can do through antMatchers for rolebased authentication can also be done through Preauthorize annotation also.

use @EnableGlobalMethodSecurity(prePostEnabled = true) annotation on the class and then apply @PreAuthorize("hasRole('ADMIN')") on the method.