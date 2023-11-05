import React from "react";
import { Register } from "../Register/Register";
import { SignIn } from "../SignIn/SignIn";

const styles = {
    welcome: {
        display: 'flex',
        alignItems: 'center',
        justifyContent: 'center',
        minHeight: '100vh'
    }
}
export const Welcome = ({route, setRoute}) => {
    return (
        <div>
            {
                route !== 'signIn' ?
                    <Register route={route} setRoute={setRoute}/> :
                    <SignIn route={route} setRoute={setRoute} />
            }
        </div>
    );
}