import React from 'react'
import './AdComponent.css'

export const AdComponent = ({ left }) => {
    return (
        <>
            {
                left ?
                    <div className='f4 shadow-2 flex items-center justify-center'
                        style={{
                            color: 'black',
                            background: 'white',
                            left: '70px'
                        }
                        }
                        id="adcomponent"
                    > AD</div > :

                    <div className='f4 shadow-2 flex items-center justify-center'
                        style={{
                            color: 'black',
                            background: 'white',
                            right: '70px'
                        }
                        }
                        id="adcomponent"
                    > AD</div >

            }

        </>


    );
}
