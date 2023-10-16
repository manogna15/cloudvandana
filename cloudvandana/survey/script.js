
const surveyForm = document.getElementById("surveyForm");
const popup = document.getElementById("popup");
const popupData = document.getElementById("popupData");
const submitBtn = document.getElementById("submitBtn");
const resetBtn = document.getElementById("resetBtn");
const closePopupBtn = document.getElementById("closePopup");

submitBtn.addEventListener("click", () => {
    if (surveyForm.checkValidity()) {
        const formData = new FormData(surveyForm);
        let dataString = "";

        for (const pair of formData.entries()) {
            dataString += `<p><strong>${pair[0]}:</strong> ${pair[1]}</p>`;
            }
             popupData.innerHTML = dataString;
            popup.style.display = "flex";
            } 
            else {
                alert("Please fill out all required fields.");
            }
        });
        resetBtn.addEventListener("click", () => {
            surveyForm.reset();
        });

        closePopupBtn.addEventListener("click", () => {
            popup.style.display = "none";
        });
    
   