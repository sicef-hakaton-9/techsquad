import React, {useContext, useState} from "react";
import { BrowserRouter, Routes, Route, Link } from "react-router-dom";
import { Welcome } from './pages/Register-SignIn/Welcome/Welcome';
import { Nav } from "./components/Nav";
import { ProviderHomePage } from "./pages/Provider-home/ProviderHomePage";
import { Request } from "./pages/Provider-request/Request";
import ParticlesBg from 'particles-bg'

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState('true');
  const [route, setRoute] = useState('home');
  const [roleID, setRoleID] = useState(2);
  const [CompanyType, setCompanyType] = useState("");
  const [TypeOfService, setTypeOfService] = useState("");
  const [PIB, setPIB] = useState("");
  const [PhoneNumber, setPhoneNumber] = useState("");
  const [City, RegisterCity] = useState("");
  const [Name, setName] = useState("");
  const [Email, setEmail] = useState("");
  const [Password, setPassword] = useState("");

  return (
    
    <div style={{ minHeight: '100vh' }}>
      <ParticlesBg type="cobweb" color="#555555" num={100} bg={true} style={{opacity: '0.04'}} />
      <Nav route={route}
        setRoute={setRoute}
        roleID={roleID}
      />
      {
        route === 'signIn' || route === 'register' ?
          <Welcome route={route}
            setRoute={setRoute}
          /> :
          route === 'home' ?
            <ProviderHomePage setRoute={setRoute}/> :
            <Request route={route} setRoute={setRoute}/>
      }
      
    </div>
  );
}

export default App;
